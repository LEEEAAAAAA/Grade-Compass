SONAR_HOST_URL ?= http://sonarqube:9000
SONAR_NETWORK ?= sonar-net
SONAR_TOKEN ?=

.PHONY: test clean coverage linting

test:
	cd backend && mvn test

clean:
	cd backend && mvn clean

coverage:
	mvn -f backend/pom.xml test
	mvn -f backend/pom.xml dependency:copy-dependencies -DoutputDirectory=target/dependency

linting: coverage
	docker run --rm \
		-e SONAR_HOST_URL="$(SONAR_HOST_URL)" \
		-e SONAR_TOKEN="$(SONAR_TOKEN)" \
		-e SONAR_USER_HOME=/usr/src/.sonar \
		--network $(SONAR_NETWORK) \
		-v .:/usr/src \
		-u $$(id -u):$$(id -g) \
		sonarsource/sonar-scanner-cli \
		-Dsonar.working.directory=/usr/src/.scannerwork
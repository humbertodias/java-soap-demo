package:
	mvn clean package

run:
	mvn embedded-glassfish:run -Dhttp.port=8080

format:
	mvn formatter:format

mdpdf-install:
	npm install mdpdf -g

pdf:
	mdpdf README.md

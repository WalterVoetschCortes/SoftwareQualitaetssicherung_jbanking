[![Build](https://github.com/marcwrobel/jbanking/workflows/build/badge.svg)](https://github.com/marcwrobel/jbanking/actions)
[![Sonarcloud Status](https://sonarcloud.io/api/project_badges/measure?project=fr.marcwrobel:jbanking&metric=alert_status)](https://sonarcloud.io/dashboard?id=fr.marcwrobel:jbanking)
[![SonarCloud Coverage](https://sonarcloud.io/api/project_badges/measure?project=fr.marcwrobel:jbanking&metric=coverage)](https://sonarcloud.io/dashboard?id=fr.marcwrobel:jbanking)
[![SonarCloud Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=fr.marcwrobel:jbanking&metric=bugs)](https://sonarcloud.io/dashboard?id=fr.marcwrobel:jbanking)
[![SonarCloud Bugs](https://sonarcloud.io/api/project_badges/measure?project=fr.marcwrobel:jbanking&metric=vulnerabilities)](https://sonarcloud.io/dashboard?id=fr.marcwrobel:jbanking)
[![Maven Central](https://img.shields.io/maven-central/v/fr.marcwrobel/jbanking.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22fr.marcwrobel%22%20AND%20a:%22jbanking%22)

# jbanking - A Java banking API

jbanking is a library of utilities to assist with developing banking functionalities. jbanking is focused on, but not limited to, European banking.

## Features

jbanking is supporting the following features :

* [ISO 3166-1 countries](http://wikipedia.org/wiki/ISO_3166-1) (with alpha-2 code, alpha-3 code, numeric code and status - e.g. independent or dependent -
  according to the [International Organization for Standardization](https://www.iso.org)).
* Countries' or territories' participation to economic agreements :
  * [European Economic Area (EEA)](https://wikipedia.org/wiki/European_Economic_Area)
  * [European Free Trade Association (EFTA)](https://wikipedia.org/wiki/European_Free_Trade_Association)
  * [European Union (EU)](https://en.wikipedia.org/wiki/European_Union)
  * [SEPA COM Pacifique](https://www.cfonb.org/Default.aspx?lid=1&rid=122&rvid=239)
  * [Single Euro Payments Area (SEPA)](https://wikipedia.org/wiki/Single_Euro_Payments_Area)
* [ISO 4217 currencies](http://wikipedia.org/wiki/ISO_4217) (with alphabetic code, numeric code, minor unit and countries using it).
* [ISO 9362:2009 BIC](http://wikipedia.org/wiki/Bank_Identifier_Code) handling and validation.
* [ISO 13616:2007 IBAN](http://wikipedia.org/wiki/International_Bank_Account_Number) handling and validation (for both checkdigit and national bank account
  number structure).
* [Creditor Identifiers (CIs)](https://www.europeanpaymentscouncil.eu/document-library/guidance-documents/creditor-identifier-overview)
  handling and validation.
* Configurable [holiday](https://wikipedia.org/wiki/Holiday) calendar support with predefined calendars for :
  * Frankfurt, London, Paris, Sydney, and Tokyo financial districts
  * Federal Reserve Bank of New York (FED)
  * New York Stock Exchange (NYSE)
  * European Union TARGET system

## Requirements

Any application that uses the jbanking library must use at least [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/index.html). No additional
dependency required !

## Use it !

You can download the latest build on [Maven Central](https://search.maven.org/artifact/fr.marcwrobel/jbanking) or use it as a maven dependency:

```xml

<dependency>
  <groupId>fr.marcwrobel</groupId>
  <artifactId>jbanking</artifactId>
  <version>3.1.1</version>
</dependency>
```

For usage examples take a look at the Javadoc or the tests.

## Releases

Take a look at the [changelog on GitHub](https://github.com/marcwrobel/jbanking/releases).

## Need help ?

Read the [javadoc](src/main/java/fr/marcwrobel/jbanking) and take a look at the [unit tests](src/test/java/fr/marcwrobel/jbanking).

Raise an [issue](https://github.com/marcwrobel/jbanking/issues?sort=created&direction=desc&state=open) or contribute
with [a pull-request](https://github.com/marcwrobel/jbanking/pulls).

Email me at [marc.wrobel@gmail.com](mailto:marc.wrobel@gmail.com).

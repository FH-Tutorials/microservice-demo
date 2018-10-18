# Microservice Demo

This demo illustrates how to connect two services using a docker compose
configuration

## Pre-Requisites

 * [Gradle](https://gradle.org/install/) or [Maven](https://maven.apache.org/install.html)
   Recommendation: use a package manager
 * Java SDK >= 1.8
 * Set [JAVA_HOME](https://docs.oracle.com/cd/E19182-01/820-7851/inst_cli_jdk_javahome_t/)
 * [Docker](https://docs.docker.com/install/) and [Docker Compose](https://docs.docker.com/compose/install/)

## Build

### install gradle-wrapper

If you use gradle install the [wrapper](https://docs.gradle.org/current/userguide/gradle_wrapper.html) first

```bash
gradle wrapper
```

### Services

Next you need to build the services by calling

```bash
./gradlew build
```

from directory *child* as well as from directory *parent*. There might be some
warnings during compilation which can be ignored.

After compilation has been successful for both directories in each of them a
executable jar file has been created with the same name:
> *[child|parent]/build/libs/gs-spring-boot-docker-0.1.0.jar*.

### compose docker images

Going back to the root directory of that service example where *docker-compose.yml*
is laying the docker images can be build using the following command

```bash
docker-compose build
```

## Run

When building has been successful it is finally possible to run the containers
by calling

```bash
docker-compose up
```

You may add the option `-d` in order to run detached mode.

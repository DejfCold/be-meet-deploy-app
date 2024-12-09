#!/bin/bash
set -e

java -jar /opt/app.jar --spring.config.profile=prod

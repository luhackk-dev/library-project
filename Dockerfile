FROM maven:latest

RUN apt-get update && apt-get install -y zsh

ENV SHELL=/bin/zsh

WORKDIR /app
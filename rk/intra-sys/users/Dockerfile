FROM node:8.1.0
RUN mkdir /users-service
COPY src/ /users-service
RUN chown -R 777 /users-service /usr/local/
WORKDIR /users-service
EXPOSE 3000
CMD ["npm", "start"]

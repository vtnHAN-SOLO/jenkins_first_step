pipeline {
    agent any

    environment {
        IMAGE_NAME = 'kirahigashi/springboot-app'
        DOCKER_CRED = credentials('dockerhub-id')
    }

    stages {
        stage('Build & Push Docker Image') {
            steps {
                script {
                    echo 'Building Docker Image...'
                    sh "docker build -t $IMAGE_NAME:latest ."

                    echo 'Pushing to Docker Hub...'
                    sh "echo $DOCKER_CRED_PSW | docker login -u $DOCKER_CRED_USR --password-stdin"
                    sh "docker push $IMAGE_NAME:latest"
                }
            }
        }

        stage('Deploy to Container') {
            steps {
                script {
                    echo 'Deploying to Container...'

                    sh "docker stop spring-app-container || true"
                    sh "docker rm spring-app-container || true"

                    sh "docker run -d --name spring-app-container -p 8090:8080 $IMAGE_NAME:latest"
                }
            }
        }
    }
}
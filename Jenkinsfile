pipeline {
  agent { label 'docker-gradle8-jdk21-corretto' }
  options {
    buildDiscarder(logRotator(numToKeepStr: '5'))
  }
  stages {
    stage('Scan') {
      steps {
        withSonarQubeEnv(installationName: 'sonarqube-server1') { 
          sh './gradelw clean buildsonar'
        }
      }
    }
  }
}
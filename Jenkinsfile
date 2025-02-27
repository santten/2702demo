pipeline {
  agent any
    stages {
      stage('checking git'){
        steps {
          git branch: 'main', url: 'https://github.com/santten/lectdemo2602.git'
        }
      }

      stage('build'){
        steps {
          bat 'mvn clean install'
        }
      }
    }
}

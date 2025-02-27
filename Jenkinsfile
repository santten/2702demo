pipeline {
  agent any
    stages {
      stage('checking git'){
        steps {
          git branch 'main' url: 'https://github.com/santten/2702demo.git'
        }
      }

      stage('build'){
        steps {
          bat 'mvn clean install'
        }
      }
    }
}

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

       stage('tests') {
        steps {
          bat "mvn test jacoco:report"
        }
        post {
          always {
            junit '**/target/surefire-reports/TEST-*.xml'
            jacoco execPattern: '**/target/jacoco.exec'
            jacoco classPattern: '**/target/classes'
            jacoco sourcePattern: '**/src/main/java'
            jacoco exclusionPattern: '**/test/**'
          }
        }
      }
    }
}

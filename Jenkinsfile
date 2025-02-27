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
            jacoco execPattern: '**/target/jacoco.exec',
                   classPattern: '**/target/classes',
                   sourcePattern: '**/src/main/java',
                   exclusionPattern: '**/test/**'
          }
        }
      }
    }
}

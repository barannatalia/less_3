pipeline{
    agent any

    stages{
        stage("Preparation"){
            steps {
                echo 'Download updates'
                gst 'https://github.com/barannatalia/less_3.git'
            }
        }
        stage("Unit test"){
            steps {
                bat 'mvn clean -DsuitXmlFile=unit_testng.xml test'
            }
        }
        stage("UI test"){
            steps {
                echo 'Hello'
            }
        }
    }
}
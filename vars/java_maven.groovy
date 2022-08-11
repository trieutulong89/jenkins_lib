def call() {
  env.PATH = "${tool 'maven'}/bin:${env.PATH}"
  packageApp()
}

// ===================================
// Package Application
// Description: Package app by mvnw
// ===================================
def packageApp() {
  print("Doing package app")
  stage('Package') {
    sh "mvn package -Dmaven.test.skip"
  }
}
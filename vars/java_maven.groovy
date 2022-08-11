def call() {
  env.PATH = "${tool 'maven'}/bin:${env.PATH}"
  packageApp()
  buildImage()
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

// ===================================
// Build docker image
// Description: Build docker image and push to docker hub
// ===================================

def buildImage() {
  print 'Doing build docker image'
  image_tag = "java-test:1"
  stage('Build Docker Image') {
    image = docker.build("${image_tag}")
  }
}
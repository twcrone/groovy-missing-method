package jfrog

import org.jfrog.artifactory.client.ArtifactoryClientBuilder
class Test {
    static void main(String[] args) {
        // Just to check/proof if there is a method 'create'
        def acb = new ArtifactoryClientBuilder().getClass().getMethods()
        acb.each {
            String s = "$it"
            if (s.contains("create")) {
                println "Found method: $s"
            }
        }
        // Call static method
        def a = ArtifactoryClientBuilder.create()
    }
}
## Compiling and running

Compile and run in `dev` mode:

`./mvnw compile quarkus:dev`

Build a native executable:

`export GRAALVM_HOME=/opt/graalvm/`

`./mvnw package -Pnative`

`./target/quarkus-kotlin-greeting-1.0-SNAPSHOT-runner`

## References

* [Getting Started Guide](https://quarkus.io/guides/getting-started-guide) 
* [Building Native Image Guide](https://quarkus.io/guides/building-native-image-guide.html)






# Covariant Return types

Covariant return types allow you to return different return types in subclass overridden methods. 
But return type should belong to super class return type

- Flower -> Super class
- Jasmine, Lily -> subClasses

Flower class has "show" method that returns a **Flower object**. 
Jasmine class override "show" method by returning a **Jasmine object**.

**This is possible because of the Covariant Return types.**


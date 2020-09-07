## Method injection
 ### If you have to pass the obj itself to the dependency


Order of operations for injections:

Constructor, field and method/function

### @Modules add objects to the dependency graph with @Provides methods, if we can't annotate their constructors with @Inject
### OR if configuration is needed after instatiating the objects.

### Use @Binds when you binmd an implementation to an interface, can be more efficient.

# Gang_of_Four_Design_Patterns

## 1. Creational Design Patterns:

- Abstract Factory Pattern (Allows the creation of objects without specifying their concrete type.)

	1. There are 2 abstract factory classes in abstractFactory package(BasePizza and BaseTopping). 
	2. Pizza class is parent of CheesePizza, PepperoniPizza and VeggiePizza.
	3. topping package is about material for bake a pizza. There are Sauce and Cheese are parents class.

- Builder Pattern (Uses to create complex objects.)

	1. House class is model for any house, There are fields, getter and setter only.
	2. HouseBuilder is interface class.
	3. ConcreteHouseBuilder and PrefabricatedHouseBuilder are type of HouseBuilder that seperate material to buld.
	4. ConstructionEngineer class is polymorphism class that build all house.
	5. ```Using getter and setter, but don't use constructor to initial object.```

- Factory Method Pattern (Creates objects without specifying the exact class to create)

    1. Override method from abstract class (BasePizzaFactory) for create object.
    2. Abstract parent class, ```no composition.``` 

- Prototype Pattern (Creates a new object from an existing object.)

	1. initially creating a prototype and then making copies of it.
	2. ``` avoid repeating objects created.``` 

- Singleton Pattern (Ensures only one instance of an object is created.)

	1.
	2.





### Licenses

- [guru-springframework-gof-design-patterns](https://springframework.guru/gang-of-four-design-patterns/)



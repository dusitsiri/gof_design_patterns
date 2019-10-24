# gof_design_patterns

## Abstract Factory Pattern

	1. There are abstract factory classes. 
	2. Dependency Injection by constructor of Implementation class.
	3. You can debug code with run unit test.

## Builder Pattern

	1. House class is model for any house, There are fields, getter and setter only.
	2. HouseBuilder is interface class.
	3. ConcreteHouseBuilder and PrefabricatedHouseBuilder are type of HouseBuilder that seperate material to buld.
	4. ConstructionEngineer class is polymorphism class that build all house.
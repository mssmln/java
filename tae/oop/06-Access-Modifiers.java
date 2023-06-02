// public is an access modifier, meaning that it is used to set the level of access. You can use access modifiers for classes, attributes, and methods.

// For classes, the available modifiers are public or default (left blank), as described below:
// public: The class is accessible by any other class.
// default: The class is accessible only by classes in the same package.

// The following choices are available for attributes and methods:
// default: A variable or method declared with no access control modifier is available to any other class in the same package.
// public: Accessible from any other class.
// protected: Provides the same access as the default access modifier, with the addition that subclasses can access protected methods and variables of the superclass.
// private: Accessible only within the declared class itself.

class AccessModifiers {
    public static void main(String[] args) {
	    Country c = new Country();
	    c.name = "France";
	    c.capital = "Paris";
	    System.out.println("Country:  " + c.name);
	    System.out.println("Capital:  " + c.capital);
    }
}

class Country {
    public String name;
    public String capital;
}
class Animal {
	var Name = ""
	var Age = 0
	var Color = ""
	var Classification = ""
	


    def this(Name: String, Age: Int, Color: String, Classification: String) {
        this()
        this.Name = Name
        this.Age = Age
        this.Color = Color
        this.Classification = Classification
    }

    override def toString(): String = s"$Name is $Age years old, $Color in color and classified as a $Classification"
}


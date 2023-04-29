fun main(args: Array<String>) {
	val myString = "Vaibhav"
	val result = myString.customExtensionFunction() // "Custom extension function called on string: Hello"
	println(result)
}


// Define an extension function on the String class
fun String.customExtensionFunction(): String {
	return "Custom extension function called on string: $this"
}
fun main() {
    val firstUserEmailId = "user_one@gmail.com"

    // The following line of code assumes that you named your parameter as emailId. 
    // If you named it differently, feel free to update the name.
    println(displayAlertMessage(operatingSystem = "Unknown", emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(operatingSystem = secondUserOperatingSystem, emailId = secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(operatingSystem = thirdUserOperatingSystem, emailId = thirdUserEmailId))
    println()
}

fun displayAlertMessage(operatingSystem: String, emailId: String): String {
    return "Alert: New user registered with operating system as $operatingSystem and email id as $emailId"
}
/*This is a function to displayAlertMessage that takes two parameters, operatingSystem and emailId, and returns a string.
In the main function, I passed the correct parameters to the displayAlertMessage function, including a default value for the operating system as "Unknown".
I also added the correct syntax for named parameters when calling the function.*/

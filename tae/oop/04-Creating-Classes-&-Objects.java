// Create a program to show loading message to your application users.
// Define a class Loading which has one public method called LoadingMessage(), which should print "Loading" when called.
// Create an object named loading and call that method.

class CreateClassesAndObjects {
    public static void main(String[] args) {
        Loading loading = new Loading();
        loading.LoadingMessage();
    }
}

class Loading {
    public void LoadingMessage() {
        System.out.print("Loading");
    }
}
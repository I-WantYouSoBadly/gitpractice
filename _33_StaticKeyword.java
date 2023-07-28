public class _33_StaticKeyword {
    public static void main(String[] args) {
        // static = modifier. A single copy of a variable/method is created and shared
        // the class owns the static member

        Friend friend1 = new Friend("Andrew Tate");
        Friend friend2 = new Friend("Walter White");
        Friend friend3 = new Friend("Jake Paul");
        Friend friend4 = new Friend("John Pork");

        Friend.displayFriends();



    }
}


/* Sort the People

You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.

For each index i, names[i] and heights[i] denote the name and height of the ith person.

Return names sorted in descending order by the people's heights.


Example 1:

Input: names = ["Mary","John","Emma"], heights = [180,165,170]
Output: ["Mary","Emma","John"]
Explanation: Mary is the tallest, followed by Emma and John.
Example 2:

Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
Output: ["Bob","Alice","Bob"]
Explanation: The first Bob is the tallest, followed by Alice and the second Bob.
 

Constraints:

n == names.length == heights.length
1 <= n <= 103
1 <= names[i].length <= 20
1 <= heights[i] <= 105
names[i] consists of lower and upper case English letters.
All the values of heights are distinct.
*/
import java.util.*;

class Person {
    String name;
    int height;

    Person(String name, int height) {
        this.name = name;
        this.height = height;
    }
}

class SortPeople {
    public String[] sortPeople(String[] names, int[] heights) {
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            people.add(new Person(names[i], heights[i]));
        }
        people.sort((a, b) -> b.height - a.height);
        String[] result = new String[people.size()];
        for (int i = 0; i < people.size(); i++) {
            result[i] = people.get(i).name;
        }
        return result;
    }

    public static void main(String[] args) {
        SortPeople sortPeople = new SortPeople();
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {160, 180, 170};
        String[] sortedPeople = sortPeople.sortPeople(names, heights);
        System.out.println(Arrays.toString(sortedPeople));
    }
}

/*
 You are given an array points where points[i] = [xi, yi] is the coordinates of the ith point on a 2D plane. Multiple points can have the same coordinates.

You are also given an array queries where queries[j] = [xj, yj, rj] describes a circle centered at (xj, yj) with a radius of rj.

For each query queries[j], compute the number of points inside the jth circle. Points on the border of the circle are considered inside.

Return an array answer, where answer[j] is the answer to the jth query.

Constraints:

1 <= points.length <= 500
points[i].length == 2
0 <= x??????i, y??????i <= 500
1 <= queries.length <= 500
queries[j].length == 3
0 <= xj, yj <= 500
1 <= rj <= 500
All coordinates are integers.

 */
class PointInsideCircle {
    double equation(int arr[], int brr[]) //function taht take points and circle constants as input and return Decimal values.
    {
        return Math.pow((brr[0]-arr[0]),2) + Math.pow((brr[1]-arr[1]),2) - Math.pow(arr[2],2); //returning value after putting the points on circle
    }
    public int[] countPoints(int[][] points, int[][] queries) { //Given function
        int res[] = new int[queries.length]; //Array res of type integer 
        for(int i = 0; i<queries.length; i++) //for loop that itrates over queries (circle)
        {
            int count = 0; //count variable of type int
            for(int j = 0; j<points.length; j++) //for loop that itrates over all given points
            {
                if(equation(queries[i],points[j]) <= 0) //checking that the value is less than or 0 after putting the value in eqation
                    count++; //incrementing the value of count
            }
            res[i] = count; //storing the value of count in res Array
        }
        return res; //returning result
    }
}
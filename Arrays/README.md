# Arrays

Array is a set of elements in a variable. Since Array is an object, can't directly print the values as in a primitive datatype. So use loops to print array elements.

### Create an Array
int[] array = new int [size];

### Loop through array
for (int i = 0; i < array.length; i++) {
<br/>&nbsp;System.out.print( array[i] );
<br/>}

## Two Dimensional Array (2D Array)

2D arrays are array of arrays. It contains small arrays as elements of the parent array.
### 2D array representation<br/>
 
&nbsp;&nbsp;10 &nbsp;11 &nbsp;16 &nbsp;90<br/>
&nbsp;&nbsp;00 &nbsp;20 &nbsp;43 &nbsp;46<br/>
&nbsp;&nbsp;98 &nbsp;31 &nbsp;77 &nbsp;22<br/>


### Create and print above array
 - Rows => 3 
 - Columns => 4<br/>

&nbsp;int [][] twoD = new int [ rows ] [ columns ];

&nbsp; **Example :** int [][] twoD = new int [ 3 ] [ 4 ];

for (int i = 0; i < array.length; i++) {
<br/>&nbsp;&nbsp;&nbsp;&nbsp;for (int i = 0; i < array.length; i++) {
<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;System.out.print( array[i] + " " );
<br/>&nbsp;&nbsp;&nbsp;&nbsp;}
<br/>}

## 3D Arrays

### 3D array representation

&nbsp;&nbsp;&nbsp;&nbsp;1 4 5 &nbsp;&nbsp;&nbsp;&nbsp;6 0 1 &nbsp;&nbsp;&nbsp;&nbsp;3 3 6 &nbsp;&nbsp;&nbsp;&nbsp;9 5 0<br/>
&nbsp;&nbsp;&nbsp;&nbsp;0 2 1 &nbsp;&nbsp;&nbsp;&nbsp;2 9 0 &nbsp;&nbsp;&nbsp;&nbsp;4 7 3 &nbsp;&nbsp;&nbsp;&nbsp;4 0 6<br/>
&nbsp;&nbsp;&nbsp;&nbsp;9 5 8 &nbsp;&nbsp;&nbsp;&nbsp;3 1 1 &nbsp;&nbsp;&nbsp;&nbsp;7 8 9 &nbsp;&nbsp;&nbsp;&nbsp;2 1 2<br/>

### Create and print 3D array
- Rows&nbsp;&nbsp;=>&nbsp;&nbsp;3
- Columns (of arrays) &nbsp;&nbsp;=> &nbsp;&nbsp;4
- Size of each array(Column) &nbsp;&nbsp;=>&nbsp;&nbsp;3<br/>

&nbsp;int [][] threeD = new int [ rows ] [ columns ] [ small array size ];

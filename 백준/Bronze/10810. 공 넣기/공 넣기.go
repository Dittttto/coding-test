package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func main() {
	var reader *bufio.Reader = bufio.NewReader(os.Stdin)
	var writer *bufio.Writer = bufio.NewWriter(os.Stdout)

	var n int = 0
	var m int = 0

	fmt.Fscanf(reader, "%d %d", &n, &m)

	var arr []int

	for i := 0; i < n; i++ {
		arr = append(arr, 0)
	}

	reader.ReadString('\n')
	for i := 0; i < m; i++ {
		var i int
		var j int
		var k int
		fmt.Fscanf(reader, "%d %d %d \n", &i, &j, &k)
		i -= 1
		j -= 1

		for x := i; x < j+1; x++ {
			arr[x] = k
		}
	}

	for i := 0; i < n; i++ {
		writer.WriteString(strconv.Itoa(arr[i]))
		writer.WriteString(" ")
	}

	defer writer.Flush()
}

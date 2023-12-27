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

	var n int
	var m int
	var arr []int

	fmt.Fscanf(reader, "%d %d\n", &n, &m)
	for i := 0; i < n; i++ {
		arr = append(arr, i+1)
	}

	for i := 0; i < m; i++ {
		var f int
		var t int

		fmt.Fscanf(reader, "%d %d\n", &f, &t)
		f -= 1
		t -= 1
		arr[f], arr[t] = arr[t], arr[f]

	}

	for i := 0; i < n; i++ {
		writer.WriteString(strconv.Itoa(arr[i]))
		writer.WriteString(" ")
	}

	defer writer.Flush()
}

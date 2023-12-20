package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	var reader *bufio.Reader = bufio.NewReader(os.Stdin)
	var writer *bufio.Writer = bufio.NewWriter(os.Stdout)

	var arr [21]int = [21]int{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}

	for i := 0; i < 10; i++ {
		var s int
		var e int
		fmt.Fscanln(reader, &s, &e)

		for s < e {
			arr[s], arr[e] = arr[e], arr[s]
			s += 1
			e -= 1
		}
	}

	for i := 1; i < len(arr); i++ {
		writer.WriteString(fmt.Sprintf("%d ", arr[i]))
	}

	writer.WriteString("\n")
	defer writer.Flush()
}

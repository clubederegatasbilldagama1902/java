public class heapSort {

    public static void main(String[] args) {
        // Array inicial desordenado
        int[] vector = {4, 10, 3, 5, 1};

        // Imprime o array original
        System.out.println("Array original:");
        for (int number : vector) {
            System.out.print(number + " ");
        }

        // Chama o método heapSort para ordenar o array
        heapSort(vector);

        // Imprime o array ordenado
        System.out.println("\nArray ordenado:");
        for (int number : vector) {
            System.out.print(number + " ");
        }
    }

    // Método principal do HeapSort
    public static void heapSort(int[] vector) {
        int size = vector.length;
        int i = size / 2;  // Começa do meio do array (último nó pai)
        int father, son, t;    // Variáveis auxiliares: pai, filho e temporária

        // Loop principal do HeapSort
        while (true) {
            // Construção do heap máximo
            if (i > 0) {
                i--;
                t = vector[i];  // Pega o elemento atual
            }
            // Extração do maior elemento (raiz do heap)
            else {
                size--;
                if (size <= 0) return;  // Condição de parada

                // Move o maior elemento (raiz) para o final do array
                t = vector[size];
                vector[size] = vector[0];
            }

            father = i;
            son = (i * 2) + 1;  // Calcula o filho esquerdo

            // Reorganiza o heap após a extração
            while (son < size) {
                // Verifica qual filho é maior (esquerdo ou direito)
                if ((son + 1 < size) && (vector[son + 1] > vector[son])) {
                    son++;  // Seleciona o filho direito se for maior
                }

                // Se o filho for maior que o pai, promove o filho
                if (vector[son] > t) {
                    vector[father] = vector[son];
                    father = son;
                    son = (father * 2) + 1;  // Avança para o próximo filho
                } else {
                    break;  // Se não, encerra o ajuste
                }
            }

            // Coloca o elemento temporário na posição correta
            vector[father] = t;
        }
    }
}

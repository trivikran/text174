class FindDuplicateElements {

  public static void main(String[] args) {

    int[] array = new int[]{2, 4, 7, 2, 11, 5, 7, 14, 22, 11, 49, 58, 14, 101, 1, 3, 205, 49, 101, 12};

    for (int i = 0; i < array.length; i++) { // outer loop
      for (int j = i + 1; j < array.length; j++) { // inner loop
        if (i != j && array[i] == array[j]) {
          System.out.println("Duplicate element found:" + array[i]);
        }
      }
    }

  }
}
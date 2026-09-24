import java.util.List;
import java.util.ArrayList;

public class Node<T> {
  T value;
  List<Node<T>> children;
  
  public Node(T value) {
    this.value = value;
    children = new ArrayList<>();
  }
}
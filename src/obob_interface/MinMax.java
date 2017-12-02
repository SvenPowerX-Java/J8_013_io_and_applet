package obob_interface;
//Обобщёный интерфейс MinMax для определения минимального и
// максимального значений
public interface MinMax<T extends Comparable<T>> {
	T min();
	T max();
}

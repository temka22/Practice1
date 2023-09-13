fun main(args: Array<String>) {
    // задание 1
    val exercises: Int = 13 // объявление константы
    var exercisesSolved: Int = 0 // объявление переменной
    exercisesSolved = +exercisesSolved + 1; // увеличение переменной на 1
    //  задание 2
    val MyAge: Int = 17 // объявление константы, котороя несёт в себе мой возраст
    exercisesSolved = +exercisesSolved + 1; // увеличение переменной на 1
    // задание 3
    val x: Double = 30.0 /* константа которая будет хранить в себе возраст, с которым необходимо будет найти
    среднее арифм значение возраста */
    var ArithmeticMeanOfAge: Double = 17.0 /* переменная, в которой будет храниться
    начальное значение  и после вычитания среднего арифм значения будет перезаписываться значение переменной */
    ArithmeticMeanOfAge = +(ArithmeticMeanOfAge + x) / 2 /* вычитание арифм значения и перезаписывание значения
    переменной */
    exercisesSolved = +exercisesSolved + 1; // увеличение переменной на 1
    // задание 4
    val testNumber: Int = 15 // создание константы
    val evenOdd = testNumber % 2 // деление с остатком
    println("1. Остаток от деления: evenOdd") // остаток от деления
    exercisesSolved = +exercisesSolved + 1;
    // задание 5
    var answer = (((0 + 1) + 10) * 10) shr 3 /* переменная в которой к 0 добавляем 1, чтобы программа не выдала ошибок
    ставим скобки, потом к сумме добавляем 10, умножение на 10 тоже берём в скобки и потом смещаемся вправо , после
    всех действий получаем число 13- это и есть результат */
    exercisesSolved = +exercisesSolved + 1;
    // задание 6
    var age = 16 // var используется, т.к далее переменная будет изменяться
    print(age)
    age = 30
    print(age)
    exercisesSolved = +exercisesSolved + 1;
    // задание 7
    var answer1: Int = (46 * 100) + 10
    var answer2: Int = (46 * 100) + (10 * 100)
    var answer3: Int = (46 * 100) + (10 / 10)
    exercisesSolved = +exercisesSolved + 1;
    // задание 8
    (5 * 3) - ((4 / 2) * 2)
    exercisesSolved = +exercisesSolved + 1;
    // задание 9
    val a = 18.0
    val b = 12.0
    val average = (a + b) / 2
    exercisesSolved = +exercisesSolved + 1;
}
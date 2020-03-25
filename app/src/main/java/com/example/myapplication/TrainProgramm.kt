package com.example.myapplication

import com.example.myapplication.Profile.disease

object TrainProgramm {
    val listchoose: Array<Muscle> = arrayOf(
        Muscle("Ноги"),
        Muscle("Руки"),
        Muscle("Спина"),
        Muscle("Грудь")
    )

    val listMuscle: Array<Muscle> = arrayOf(
        Muscle("Грудные мышцы"),//0
        Muscle("Трицепс"),//1
        Muscle("Широчайшие мышцы спины"),//2
        Muscle("Бицепс"),//3
        Muscle("Ягодичные мышцы"),//4
        Muscle("Мышцы бедра"), //5
        Muscle("Трапециевидные мышцы"),//6
        Muscle("Дельтовидные мышцы"),//7
        Muscle("Квадрицепсы"),//8
        Muscle("Икры")//9
    )

    val listBroke: Array<Disease> = arrayOf(
        Disease("Перелом руки"),
        Disease("Перелом ноги"),
        Disease("Перелом ключицы"),
        Disease("Перелом позвоночника"),
        Disease("Компрессионный перелом позвоночника"),
        Disease("Сколиоз 1-2 степени"),
        Disease("Вегетососудистая дистония"),
        Disease("Сахарный диабет 1 типа"), // без ограничений по упражнениям
        Disease("Сахарный диабет 1 типа"), // рекомендуется избегать упражнений,
        // при выполнении которых происходит резкая смена положения тела (гиперэкстензия, некоторые виды упражнений на пресс)



    )

    val listExcercise: Array<Excercise> = arrayOf(
        Excercise("Отжимания", (arrayOf(listMuscle[0], listMuscle[1]))),
        Excercise("Подтягивания", (arrayOf(listMuscle[2], listMuscle[3]))),
        Excercise("Приседания", (arrayOf(listMuscle[4], listMuscle[5]))),
        Excercise("Становая тяга", (arrayOf(listMuscle[2], listMuscle[4]))),
        Excercise("Жим от груди", (arrayOf(listMuscle[0], listMuscle[1], listMuscle[7]))),
        Excercise("Бег", (arrayOf(listMuscle[5], listMuscle[9], listMuscle[8], listMuscle[4])))
    )

    init {
        listExcercise[0].diseases = arrayOf(listBroke[1])
        listExcercise[1].diseases = arrayOf(listBroke[1])
        listExcercise[2].diseases = arrayOf(listBroke[0])
        listExcercise[3].diseases = arrayOf(listBroke[0], listBroke[1])
        listExcercise[4].diseases = arrayOf(listBroke[1])
        listExcercise[5].diseases = arrayOf(listBroke[0])
    }

    //Болезнь - опциональный параметр, она может не передаваться
    fun checkExercise(disease: List<Disease>? = null): MutableList<Excercise> {
        var actual = listExcercise.clone().toMutableList()
        if (disease != null) {
            disease.forEach { tit ->
                repeat(actual.size) {
                    actual.removeAll { it.checkDiseases(tit) }
                }
            }
        }
        return actual
    }
    fun checkExerciseChoose(muscle: List<Muscle>? = null): MutableList<Excercise>{
        var actual = checkExercise(disease!!)
        if (muscle != null){
            muscle.forEach { ti ->
                repeat(actual.size){
                    actual.removeAll { it.checkChoose(ti) }
                }
            }
        }
        return actual
    }
}


//    fun checkAll(disease: List<Disease>? = null, ibm: Float):MutableList<Excercise>{
//
//        return checkExerciseIMB(checkExercise(disease),ibm)
//
//    }
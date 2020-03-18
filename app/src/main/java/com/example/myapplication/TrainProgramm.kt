package com.example.myapplication

object TrainProgramm {
    val listMuscle: Array<Muscle> = arrayOf(
        Muscle("Грудные мышцы"),
        Muscle("Трицепс"),
        Muscle("Широчайшие мышцы спины"),
        Muscle("Бицепс"),
        Muscle("Ягодичные мышцы"),
        Muscle("Мышцы бедра")
    )

    val listBroke: Array<Disease> = arrayOf(
        Disease("Нет ног"),
        Disease("Нет рук")
    )

    val listExcercise: Array<Excercise> = arrayOf(
        Excercise("Отжимания", (arrayOf(listMuscle[0], listMuscle[1]))),
        Excercise("Подтягивания", (arrayOf(listMuscle[2], listMuscle[3]))),
        Excercise("Приседания", (arrayOf(listMuscle[4], listMuscle[5])))
    )
    init {
        listExcercise[1].diseases = arrayOf(listBroke[1])
        listExcercise[2].diseases = arrayOf(listBroke[0])
    }
    //    fun checkAll(disease: List<Disease>? = null, ibm: Float):MutableList<Excercise>{
//
//        return checkExerciseIMB(checkExercise(disease),ibm)
//
//    }
    //Болезнь - опциональный параметр, она может не передаваться
    fun checkExercise(disease: List<Disease>? = null): MutableList<Excercise> {
        var actual = listExcercise.clone().toMutableList()
        if (disease != null) {
            for (i in 0..actual.size - 1) {
                disease.forEach {
                    actual.remove(
                        actual.find { excercise: Excercise -> excercise.checkDiseases(it) }
                    )
                }
            }
        }
        return actual
    }
}
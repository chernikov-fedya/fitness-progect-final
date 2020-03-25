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
        Muscle("Икры"), //9
        Muscle("Двуглавая мышца плеча"),//10
        Muscle("Внутреняя поверхность бедра"),//11
        Muscle("Внешняя поверхность бедра"),//12
        Muscle("Передняя зубчатая мыщца"),//13
        Muscle("Наружная косая мыщца"),//14
        Muscle("Прямая мышца живота"),//15
        Muscle("Мыщцы голени"),//16
        Muscle("Разгибатели спины"),//17
        Muscle("Передняя большеберцовая мышца"),//18
        Muscle("Абдоминальные мышцы")//19
    )


    val listExcercise: Array<Excercise> = arrayOf(
        Excercise("Отжимания", (arrayOf(listMuscle[0], listMuscle[1]))), // 0
        Excercise("Подтягивания", (arrayOf(listMuscle[2], listMuscle[3]))), //1
        Excercise("Приседания", (arrayOf(listMuscle[4], listMuscle[5]))), //2
        Excercise("Становая тяга", (arrayOf(listMuscle[2], listMuscle[4]))), //3
        Excercise("Жим от груди (лёжа)", (arrayOf(listMuscle[0], listMuscle[2], listMuscle[10]))), //4
        Excercise("Бег", (arrayOf(listMuscle[5], listMuscle[9], listMuscle[8], listMuscle[4]))), //5
        Excercise("Жим от груди (сидя)", arrayOf(listMuscle[0], listMuscle[1], listMuscle[7])), //6
        Excercise("Приседания с гирей", arrayOf(listMuscle[8], listMuscle[4], listMuscle[5])), //7
        Excercise("Жим двумя ногами", arrayOf(listMuscle[8], listMuscle[4], listMuscle[11], listMuscle[12], listMuscle[4])), //8
        Excercise("Сгибание рук на бицепс-машине", arrayOf(listMuscle[3])), //9
        Excercise("Сгибания в пресс-машине", arrayOf(listMuscle[15], listMuscle[14], listMuscle[13])), //10
        Excercise("Выпады", arrayOf(listMuscle[8], listMuscle[4], listMuscle[16] )), //11
        Excercise("Румынская тяга", arrayOf(listMuscle[8], listMuscle[4], listMuscle[6])), //12
        Excercise("Гиперэкстензия", arrayOf(listMuscle[4], listMuscle[5])), //13
        Excercise("Обратная гиперэкстензия", arrayOf(listMuscle[4], listMuscle[5], listMuscle[17])), //14
        Excercise("Тяга в наклоне", arrayOf(listMuscle[2], listMuscle[6], listMuscle[17])), //15
        Excercise("Скручивания на римском стуле", arrayOf(listMuscle[15], listMuscle[14], listMuscle[18])), //16
        Excercise("Подъёмы таза со штангой", arrayOf(listMuscle[4], listMuscle[19])), //17
        Excercise("Подъем ног на скамье", arrayOf(listMuscle[15], listMuscle[5])) //18
    )
    val listBroke: Array<Disease> = arrayOf(
        Disease("Перелом руки"), //0
        Disease("Перелом ноги"), //1
        Disease("Перелом ключицы"), //2
        Disease("Перелом позвоночника"), //3
        Disease("Компрессионный перелом позвоночника"), //4
        Disease("Сколиоз 1-2 степени"), //5
        Disease("Вегетососудистая дистония"), //6
        Disease("Сахарный диабет 1 типа"), // без ограничений по упражнениям 7
        Disease("Сахарный диабет 2 типа") // рекомендуется избегать упражнений, 8
        // при выполнении которых происходит резкая смена положения тела (гиперэкстензия, некоторые виды упражнений на пресс)
    )


    init {
        listExcercise[0].diseases = arrayOf(listBroke[0], listBroke[4], listBroke[2]))
        listExcercise[1].diseases = arrayOf(listBroke[2])
        listExcercise[2].diseases = arrayOf(listBroke[1], listBroke[4], listBroke[6])
        listExcercise[3].diseases = arrayOf(listBroke[0], listBroke[1], listBroke[4], listBroke[3], listBroke[6], listBroke[7], listBroke[8])
        listExcercise[4].diseases = arrayOf(listBroke[0], listBroke[2], listBroke[6])
        listExcercise[5].diseases = arrayOf()
        listExcercise[6].diseases = arrayOf(listBroke[0])
        listExcercise[7].diseases = arrayOf(listBroke[0])
        listExcercise[8].diseases = arrayOf(listBroke[0])
        listExcercise[9].diseases = arrayOf(listBroke[0])
        listExcercise[10].diseases = arrayOf(listBroke[0])
        listExcercise[11].diseases = arrayOf(listBroke[0])
        listExcercise[12].diseases = arrayOf(listBroke[0])
        listExcercise[13].diseases = arrayOf(listBroke[0])
        listExcercise[14].diseases = arrayOf(listBroke[0])
        listExcercise[15].diseases = arrayOf(listBroke[0])
        listExcercise[16].diseases = arrayOf(listBroke[0])
        listExcercise[17].diseases = arrayOf(listBroke[0])
        listExcercise[18].diseases = arrayOf(listBroke[0])
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
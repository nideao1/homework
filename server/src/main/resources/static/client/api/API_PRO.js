export default {

    baseURL: 'http://localhost:8080/',//后端地址
    
    method: 'post',		//post请求
    //登录模块接口
    studentLogin:{url:'student/login'},
    teacherLogin:{url:'teacher/login'},

    //注册模块接口
    studentReg:{url:'student/insertStudent'},
    teacherReg:{url:'teacher/insertTeacher'},

    getStuList:{url:'student/getStudentList'},

    allHomeworkList:{url:'homework/getHomeworkList'},
    tHomeworkList:{url:'homework/getTHomeworkList'},

	//增删改模块接口
    addHW:{url:'homework/addHomework'},
    deletHW:{url:'homework/deleteHomework'},
    updateHW:{url:'homework/updateHome'},

    detailSHList:{url:'homework/getDetailHomeworkList'},
    studentSHList:{url:'homework/getMyHomeworkList'},
	
	//作业增改模块接口
    submitSHom:{url:'homework/insertHomework'},
    updateSHome:{url:'homework/updateHomework'},


}

package com.github.lseodoo.teatetet.services

import com.intellij.openapi.project.Project
import com.github.lseodoo.teatetet.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

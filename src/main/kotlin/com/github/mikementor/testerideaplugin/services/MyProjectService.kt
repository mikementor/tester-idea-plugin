package com.github.mikementor.testerideaplugin.services

import com.intellij.openapi.project.Project
import com.github.mikementor.testerideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

package com.github.roryphillips.jetbrainsbuildkiteplugin.services

import com.github.roryphillips.jetbrainsbuildkiteplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

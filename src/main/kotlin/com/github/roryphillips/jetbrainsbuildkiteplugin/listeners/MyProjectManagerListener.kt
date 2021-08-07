package com.github.roryphillips.jetbrainsbuildkiteplugin.listeners

import com.github.roryphillips.jetbrainsbuildkiteplugin.services.MyProjectService
import com.intellij.openapi.components.service
import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ProjectManagerListener

internal class MyProjectManagerListener : ProjectManagerListener {

    override fun projectOpened(project: Project) {
        project.service<MyProjectService>()
    }
}

package org.jetbrains.xpm

import com.intellij.openapi.project.Project
import com.intellij.openapi.util.Condition

class XpmToolWindowCondition : Condition<Project> {

    override fun value(project: Project): Boolean {
        return true
    }
}
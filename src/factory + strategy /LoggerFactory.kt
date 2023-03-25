package com.strato.hidrive.logger

import timber.log.Timber.Tree

interface LoggerFactory {
	fun create(tree: Tree): TimberLogger
}
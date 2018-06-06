# Copyright (c) 2018 LG Electronics, Inc.

DESCRIPTION = "duckietown2 package group"

inherit packagegroup

PACKAGES = "${PN}"

RDEPENDS_${PN} = "\
	duckietown \
	duckietown-msgs \
	adafruit-drivers \
	dagu-car \
	pi-camera \
	joy-mapper \
"

	
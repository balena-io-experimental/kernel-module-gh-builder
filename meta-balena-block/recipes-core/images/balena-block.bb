# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Barebone block image."
LICENSE = "MIT"

inherit image

IMAGE_INSTALL= "\
    kernel-module-cw2015-battery \
"
IMAGE_LINGUAS = " "
VIRTUAL-RUNTIME_init_manager = ""
INITRAMFS_IMAGE = ""
IMAGE_FSTYPES = "tar.gz"
PACKAGE_EXCLUDE= "update-rc.d"
ROOTFS_POSTPROCESS_COMMAND:remove = "rpi_generate_sysctl_config"

IMAGE_INSTALL_append_ls1012a = " ppfe-firmware"

inherit disable-services
ROOTFS_POSTPROCESS_COMMAND_append_ls1012a = "rootfs_disable_unnecessary_services;"

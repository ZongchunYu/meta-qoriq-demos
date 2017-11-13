require recipes-core/images/core-image-minimal.bb

SUMMARY = "Minimal networking image used for evaluating the NXP SOCs"
DESCRIPTION = "The mininal networking image which includes some useful \
networking, benchmark and NXP specific packages. It is used for evaluating \
the NXP QorIQ SOCs."

LICENSE = "MIT"

QORIQ-PKGS = ""
# NOTE: Remove the conditional pkc-host inclusion and all traces of c29x_pkc
# DISTRO_FEATURE if pkc-host no longer requires customized cryptodev patches
QORIQ-PKGS_qoriq = "asf merge-files udev-rules-qoriq \
    ${@bb.utils.contains('DISTRO_FEATURES', 'c29x_pkc', 'pkc-host', '', d)} \
"

QORIQ-PKGS_append_qoriq-ppc = " \
    apptrk \
    eth-config \
    hypervisor-partman \
"
QORIQ-PKGS_append_fsl-lsch3 = " restool"
QORIQ-PKGS_append_e500v2 = "apptrk testfloat"
QORIQ-PKGS_append_e6500-64b = " kernel-module-ceetm"

# e6500 only support 64bit hypervisor
QORIQ-PKGS_remove_e6500 = "hypervisor-partman"
QORIQ-PKGS_append_e6500 = " lib64-hypervisor-partman"

QORIQ-PKGS_append_c293pcie = " skmm-ep"
QORIQ-PKGS_append_ls1043ardb = " eth-config"
QORIQ-PKGS_append_ls1046rrdb = " eth-config"
QORIQ-PKGS_append_p1023rdb = " fmc eth-config"
QORIQ-PKGS_append_b4860qds = "\
    ipc-ust \
    kernel-module-ipc-multi \
    kernel-module-ipc-single \
"
QORIQ-PKGS_append_b4420qds = "\
    ipc-ust \
    kernel-module-ipc-multi \
    kernel-module-ipc-single \
"
QORIQ-PKGS__append_p4080ds = "\
    skmm-ep \
    skmm-host \
"
QORIQ-PKGS_append_t4240qds = "\
    skmm-ep \
    skmm-host \
"
QORIQ-PKGS_append_t1040 = " \
    ceetm \
    kernel-module-ar \
    kernel-module-uio-seville \
"
QORIQ-PKGS_append_t1042 = " \
    ceetm \
    kernel-module-ar \
"

IMAGE_INSTALL_append_qoriq = " \
    coreutils \
    elfutils \
    e2fsprogs \
    e2fsprogs-badblocks \
    e2fsprogs-e2fsck \
    e2fsprogs-tune2fs  \
    file \
    i2c-tools \
    kmod \
    libhugetlbfs \
    lmsensors-sensors \
    memtester \
    minicom \
    pkgconfig \
    python-subprocess \
    python-datetime \
    python-json \
    procps \
    psmisc \
    sysfsutils \
    sysklogd \
    sysstat \
    ${QORIQ-PKGS} \
"


IMAGE_INSTALL_append_qoriq = " \
    bridge-utils \
    ethtool \
    iproute2 \
    iproute2-tc \
    iptables \
    iputils \
    inetutils \
    inetutils-ftp \
    inetutils-hostname \
    inetutils-ifconfig \
    inetutils-logger \
    inetutils-ping \
    inetutils-ping6 \
    inetutils-rsh \
    inetutils-syslogd \
    inetutils-telnet \
    inetutils-tftp \
    inetutils-traceroute \
    ipsec-tools \
    ipsec-demo \
    net-tools \
    tcpdump \
"

IMAGE_INSTALL_append_qoriq = " \
    inetutils-inetd \
    inetutils-ftpd \
    inetutils-rshd \
    inetutils-tftpd \
    inetutils-telnetd \
"
IMAGE_INSTALL_append_qoriq = " \
    packagegroup-fsl-tools-benchmark \
